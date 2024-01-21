package SRP;

import java.util.Date;

/**
 * Класс представляет собой сотрудника в организации.
 */
public class Employee {
    private String name;
    private Date dob;
    protected int baseSalary;

    /**
     * Конструктор класса Employee.
     *
     * @param name        Имя сотрудника.
     * @param dob         Дата рождения сотрудника.
     * @param baseSalary  Базовая зарплата сотрудника.
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Метод для получения информации о сотруднике.
     *
     * @return Строка с информацией о сотруднике (имя и дата рождения).
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
