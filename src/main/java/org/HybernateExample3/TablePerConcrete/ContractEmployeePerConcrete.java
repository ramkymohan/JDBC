package org.HybernateExample3.TablePerConcrete;

import javax.persistence.*;

@Entity
@DiscriminatorValue("contract_employee")
@AttributeOverrides({
        @AttributeOverride(name="emp_id", column=@Column(name="emp_id")),
        @AttributeOverride(name="emp_name", column=@Column(name="emp_name"))
})
@Table(name = "contractemployeeconcrete")
public class ContractEmployeePerConcrete extends EmployeePerConcret {
    @Column
    float pay_per_hour;
    @Column
    String contract_period;

    public float getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(float pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public String getContract_period() {
        return contract_period;
    }

    public void setContract_period(String contract_period) {
        this.contract_period = contract_period;
    }
}
