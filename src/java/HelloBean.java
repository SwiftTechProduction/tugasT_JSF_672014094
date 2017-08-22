/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Lukas
 */
@Named(value = "helloBean")
@Dependent
public class HelloBean 
{
    private String nama;
    private String no_telp;
    private String alamat;
    private String jurusan;
    private String motto_hidup;

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getNo_telp() 
    {
        return no_telp;
    }

    public void setNo_telp(String no_telp) 
    {
        this.no_telp = no_telp;
    }

    public String getAlamat() 
    {
        return alamat;
    }

    public void setAlamat(String alamat) 
    {
        this.alamat = alamat;
    }

    public String getJurusan() 
    {
        return jurusan;
    }

    public void setJurusan(String jurusan) 
    {
        this.jurusan = jurusan;
    }

    public String getMotto_hidup() 
    {
        return motto_hidup;
    }

    public void setMotto_hidup(String motto_hidup) 
    {
        this.motto_hidup = motto_hidup;
    }
    
    
    /**
     * Creates a new instance of HelloBean
     */
    public HelloBean() 
    {
        
    }
    
    public String selectPage() 
    {
        if (jurusan.equalsIgnoreCase("Teknik Informatika")) 
        {
            return "output";
        }
        if (jurusan.equalsIgnoreCase("")) 
        {
            return "lain";
        } 
        else 
        {
            return "other";
        }
    }
    
}
