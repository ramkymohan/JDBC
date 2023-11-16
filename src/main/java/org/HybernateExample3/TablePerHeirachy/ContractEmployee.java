package org.HybernateExample3.TablePerHeirachy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract_employee")
public class ContractEmployee extends Emplyee{
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
