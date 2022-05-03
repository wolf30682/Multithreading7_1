public class CalcCredit {

    // Надо вычислить, написать следующие методы:
    // Рассчет месячного платежа
    // Рассчет общей суммы к возврату в банк
    // Рассчет переплаты за весь период

    // для простоты не будем использовать сложные вычисления,
    // а сделаем простейший расчёт ежемесячного платежа
    public double calcOfMounthlyPayment(int loanSum, double interestRate, int creditPeriod) {
        // Пусть такой формулой у нас расчитывается ежемесячный платёж
        double calculation = (loanSum + loanSum * (interestRate / 100)) / creditPeriod;
        return calculation;
    }

    // простейший метод расчёта общей суммы к возврату в банк
    public double calcOfTotalSum(int loanSum, double interestRate){
        double calculation = loanSum + (loanSum * interestRate / 100);
        return calculation;
    }

    // простейший метод расчёта переплаты за весь период
    public double calcOfOverpayment (int loanSum, double interestRate) {
        double calculation = loanSum  * interestRate / 100;
        return calculation;
    }
}
