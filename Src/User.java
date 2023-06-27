public class User {
    private String login;
    Account account;

    public User(String login, String password){
        this.login=login;
        this.account=new Account(password);

    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String newLogin){
        login=newLogin;
    }
    public class Account{
        private String password;

        public Account(String password) {
            this.password = password;
        }
        public String getPassword(){
            return password;
        }
        public String setPassword(String newPass){
            return password;
        }
        public void displayAccount(){
            System.out.println("Account Login succesful! Login: "+User.this.login+", Password: "+password);
        }
    }

}
