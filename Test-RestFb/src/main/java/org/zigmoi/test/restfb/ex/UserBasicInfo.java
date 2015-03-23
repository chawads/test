package org.zigmoi.test.restfb.ex;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class UserBasicInfo {

    final static String myUserId = "10205881708309446";
    final static String myAccessToken = "CAAUbz1eqFr4BACmYJpcZBc9lAVUAZB0VftZCAVdu9UU7Hf3z1D7fZCLIR6CTpcOBqXEtxep7MLhKMgC6NgCHoaPmKxSoblVWkV30vBPDa9qPgw9mn99gFUlIJmnmeWujtedysdyZBCmiX6i4MBxPpKyIVAkXWgDfOTCGeAk9COCd9180ZBa4W1cQi7BkHLsGtuFCUdHhcomQxZCHCu6a8dE";
    final static String sandeepUserId = "10153437722467289";
    final static String sandeepAccessToken = "CAACEdEose0cBAObJQ6DzUCDKD6gDZBh7snsMm8yvmjnctAyrOSt4Bwda3qWZAZATyQmcOFKDabeJLfVUwwy9ZAo64sXffhXcudwmj7SqZCg28VRqBJIY6ZCQXibrvk03WBs3JWFimEpPM9vSsg4QMZAZBHY3D3sNTuNioU5Yfst5Ncqrw4DEiBzZABFcyhZCAzp8YQV3pHbgbADER1pYIY4ZB8l";
    final static String gammaUserId = "591431434296405";

	public static void main(String[] args) {
        FacebookClient fc = new DefaultFacebookClient(sandeepAccessToken);
        User me = fc.fetchObject(sandeepUserId, User.class);
        System.out.println(me.getBirthday());
	}
}
