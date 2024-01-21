package SRP;

import java.util.Date;

/**
 * Класс представляет собой управляющего по зарплате, который является подклассом сотрудника (Employee).
 */
public class SalaryManager extends Employee {

    /**
     * Конструктор класса SalaryManager.
     *
     * @param name       Имя управляющего по зарплате.
     * @param dob        Дата рождения управляющего по зарплате.
     * @param baseSalary Базовая зарплата управляющего по зарплате.
     */
    public SalaryManager(String name, Date dob, int baseSalary) {
        super(name, dob, baseSalary);
    }

    /**
     * Метод для вычисления чистой зарплаты с учетом налога.
     *
     * @param baseSalary Базовая зарплата.
     * @return Чистая зарплата (без учета налога).
     */
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // Расчет налога
        return baseSalary - tax;
    }
}
