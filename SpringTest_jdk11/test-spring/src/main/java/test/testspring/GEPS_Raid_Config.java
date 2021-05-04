package test.testspring;

import org.apache.tomcat.jni.OS;

public class GEPS_Raid_Config {

    /*AS-iS (Raid 1)

    OS,DB,APP
    |   disk1   |   disk2   |
        1.2T        1.2T
    --------------------------------------------------------
    TO-BE (Raid 1+5)

    OS (Raid 1)
    |   disk1   |   disk2   |
        1.2T        1.2T

    DB, APP (Raid 5)
    |   disk1   |   disk2   |   disk3   |   disk4   |
        1.2T        1.2T        1.2T        1.2T*/
    

}
