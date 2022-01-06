/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astrolife.IJSE.Modal;

/**
 *
 * @author Geethma Chathurika
 */
public class DetailsModal {
    private String nic;
    private String name;
    private String birthday;
    private String birthtime;
    private String birthplace ;
    
    
    
    public DetailsModal(String nic, String name, String birthday, String birthtime, String birthplace){
        this.nic = nic;
        this.name = name;
        this.birthday = birthday;
        this.birthtime = birthtime;
        this.birthplace = birthplace;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the birthtime
     */
    public String getBirthtime() {
        return birthtime;
    }

    /**
     * @param birthtime the birthtime to set
     */
    public void setBirthtime(String birthtime) {
        this.birthtime = birthtime;
    }

    /**
     * @return the birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * @param birthplace the birthplace to set
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    
    @Override
    public String toString() {
        return "DetailsModal" + "nic=" + nic + ", name=" + name + ", birthday=" + birthday + ", birthtime=" + birthplace + ", birthplace=" + birthplace + '}';
    }
    
}
