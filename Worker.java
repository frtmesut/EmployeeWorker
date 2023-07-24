package Employee;

public class Worker {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Worker(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        int extraWorkHours = Math.max(workHours - 40, 0);
        return extraWorkHours * 30;
    }

    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public double totalSalary() {
        double totalSalary = salary + bonus() - tax();
        return totalSalary;
    }

    public double totalSalaryWithRaise() {
        double totalSalaryWithRaise = totalSalary() + raiseSalary();
        return totalSalaryWithRaise;
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + " TL" + "\n" +
                "Çalışma Saati: " + workHours + " saat" + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + " TL" + "\n" +
                "Bonus: " + bonus() + " TL" + "\n" +
                "Maaş Artışı: " + raiseSalary() + " TL" + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary() + " TL" + "\n" +
                "Toplam Maaş: " + totalSalaryWithRaise() + " TL" + "\n";
    }
}
