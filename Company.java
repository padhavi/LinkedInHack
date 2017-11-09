package hk.ust.cse.comp107x.linkedinhack;


public class Company {
    private String userName;
    private String email;
    // private boolean hasLoggedInWithPassword;


    /**
     * Required public constructor
     */
    public Company() {

    }

    /**
     * Use this constructor to create new User.
     * Takes user name, email and timestampJoined as params
     *
     * @param name
     * @param email
     *
     */
    public Company(String name, String email) {
        this.userName = name;
        this.email = email;

        //  this.hasLoggedInWithPassword = false;
    }

    public String getName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }


    /*public boolean isHasLoggedInWithPassword() {
        return hasLoggedInWithPassword;
    }*/
}
