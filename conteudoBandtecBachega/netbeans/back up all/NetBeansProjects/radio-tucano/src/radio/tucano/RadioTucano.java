
package radio.tucano;


public class RadioTucano {
    
    private Integer canal = 0;
    private Integer volume = 0;
    private String radio = "";
    private Boolean status = false;

    
    
    public void setCanal(Integer canal) {
        this.canal = canal;
       switch (canal) {
            case 89:
                radio = "Rádio Rock";
                break;
            case 50:
                radio = "Essa é pirata!";
                break;
            case 100:
                radio = "Jovem Pam";
                break;
            case 104:
                radio = "Rádio Top FM";
                break;
            case 106:
                radio = "Rádio Mix";
                break;
            default:
                radio = "ZzZzzzZ";
                break;
        }
    }

    public String getRadio() {
        return radio;
    }
    
    
    
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public Integer getVolume(){
        return volume;
    }
    public Boolean getStatus() {
        return status;  
    }
    public void liga(){      
//        Integer resto = contador % 2;
            this.status = !this.status;
        }
    }