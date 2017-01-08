package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
@Table(name = "t_user")
public class User extends Model {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    public String userName;

    @NotNull
    public String password;

    @CreatedTimestamp
    public Date createdAt;

    @Version
    @UpdatedTimestamp
    public Date updatedAt;

    public static Finder<Long, User> find = new Finder<Long,User>(User.class);
}