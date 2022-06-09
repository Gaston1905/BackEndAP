
package com.gaitan.SpringAuthentication.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "aboutme")
public class AboutMe implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "id_about")
    private Long idAboutMe;
    
    @Column(length=1000, name= "profile_about", nullable=false)
    private String profileAboutMe;
    
    @Column(length=500, name= "title_about", nullable=false)
    private String titleAboutMe;
    
    @Column(length=500, name= "desc_about", nullable=false)
    private String descAboutMe;
    
    public AboutMe(){
        
    }

    public AboutMe(Long idAboutMe, String profileAboutMe, String titleAboutMe, String descAboutMe) {
        this.idAboutMe = idAboutMe;
        this.profileAboutMe = profileAboutMe;
        this.titleAboutMe = titleAboutMe;
        this.descAboutMe = descAboutMe;
    }

    public Long getIdAboutMe() {
        return idAboutMe;
    }

    public void setIdAboutMe(Long idAboutMe) {
        this.idAboutMe = idAboutMe;
    }

    public String getProfileAboutMe() {
        return profileAboutMe;
    }

    public void setProfileAboutMe(String profileAboutMe) {
        this.profileAboutMe = profileAboutMe;
    }

    public String getDescAboutMe() {
        return descAboutMe;
    }

    public void setDescAboutMe(String descAboutMe) {
        this.descAboutMe = descAboutMe;
    }
    
    public String getTitleAboutMe(){
        return titleAboutMe;
    }
    
    public void setTitleAboutMe(String titleAboutMe){
        this.titleAboutMe = titleAboutMe;
    }
    
    
}
