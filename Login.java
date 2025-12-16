public class Login {
    private String[] username = {"zaaldii22", "meyslsa", "neraketnyamuk"};
    private String[] password = {"PEMDASgampangBGT", "akuSukaBLJR", "kakigorengwangi"};

    public static String userLogin = null;
    public boolean cekLogin(String name, String pass){
        for(int a=0; a<username.length; a++){
            if(name.equals(username[a]) && pass.equals(password[a])){
                userLogin = username[a];
                return true;
            }
        }
        return false;
    }
}

