package MVC.model;

import javax.swing.JOptionPane;
import MVC.Event.PelangganListener;
import MVC.View.PelangganView;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program MVC - Model
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireonChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireonChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireonChange();
    }
    
    protected void fireonChange(){
        
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm(){
        
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
        
        
    }

    
}
