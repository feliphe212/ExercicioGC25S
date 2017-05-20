
package com.AppWeb.entidade;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class MaskView {
     
    private String cpf;
    private String pass;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
 
}