package org.HybernateExample3.TablePerConcrete;

import javax.persistence.*;

@Entity
@AttributeOverrides({
        @AttributeOverride(name="emp_id", column=@Column(name="emp_id")),
        @AttributeOverride(name="emp_name", column=@Column(name="emp_name"))
})
@Table(name = "regularEmployeeConcrete")
public class RegularEmployeePerConcrete extends EmployeePerConcret {
    @Column
    float salary;
    @Column
    int bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
