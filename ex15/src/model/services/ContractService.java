package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, Integer months){    
        Double amount = contract.getTotalValue()/months; // <-- valor total das parcelas

        for(int i = 1; i <= months; i++){
            LocalDate newDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(amount, i);
            double fee = onlinePaymentService.paymentFee(amount + interest);
            double quota = amount + interest + fee;

            contract.getInstallments().add(new Installment(newDate, quota));
        
        }
    }
}
