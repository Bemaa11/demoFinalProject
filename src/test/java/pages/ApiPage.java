package pages;

import helper.Endpoint;

public class ApiPage {

    String setURL;


    public void prepareUrlFor(String url){
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
                default:
                    System.out.println("input right url");
        }
        System.out.println("endpoint siap pakai adalah ; " + setURL);
    }

    public void hitApiGetListUsers() {
        System.out.println("step from page ke 2");
    }

    public void validationStatusCodeIsEquals(){
        System.out.println("step from page ke 3");
    }

    public void validationResponseBodyGetListUsers() {
        System.out.println("step from page ke 4");
    }

    public void validationResponseJsonWithJSONSchema() {
        System.out.println("step from page ke 5");
    }
}

