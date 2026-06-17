package vendorTraining.Exceptions;

import java.util.Scanner;

public class ATMwithdrawalValidation {
    static class InvalidAmountException extends Exception{
        public InvalidAmountException(String message){
            super(message);
        }
    }
    static class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(String message){
            super(message);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount_withdrawal = sc.nextInt();

        try{
            if(balance < amount_withdrawal){
                throw new InsufficientBalanceException("you dont have enough amount to withdraw!!!");
            }
            if(amount_withdrawal <= 0){
                throw new InvalidAmountException("Enter valid amount...");
            }
        }
        catch(InsufficientBalanceException e){
            System.out.println("low balance");
        }
        catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finallyy");
        }
        int available = balance - amount_withdrawal;
        if(amount_withdrawal < balance &&  amount_withdrawal > 0){
            System.out.println(available);
        }
    }
}
