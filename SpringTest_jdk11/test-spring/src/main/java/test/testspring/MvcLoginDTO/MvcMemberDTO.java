package test.testspring.MvcLoginDTO;


public class MvcMemberDTO {
    private String userid;
    private String password;
    private String name;

    // getter, setter, 생성자, toString()

    //생성자
    public MvcMemberDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MvcMemberDTO(String userid, String password, String name) {
        super();
        this.userid = userid;
        this.password = password;
        this.name = name;
    }

    // getter, setter
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // toString()
    @Override
    public String toString() {
        return "MvcMemberDTO [userid=" + userid + ", password=" + password + ", name=" + name + "]";
    }
}
