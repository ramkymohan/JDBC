package org.HybernateExample3.TablePerHeirachy;

import javax.persistence.*;

@Entity
@Table(name = "employePerHerieachy")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Emplyee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int emp_id;
    @Column
    String emp_name;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
}
