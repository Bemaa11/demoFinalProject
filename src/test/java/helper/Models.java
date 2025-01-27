package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;

    private static void setUpHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 9d2570065436c9f331a08dab53fdff4d8bf8208f6b8a2a468e88c04f7b4943a2");
    }

    public static Response getListUsers(String endpoint) {
        setUpHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String name = "Bima Rachmat Setiawan";
        String gender = "Male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setUpHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response deleteUser(String endpoint, String user_id) {
        setUpHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id) {
        setUpHeaders();

        String name = "Bima Rachmat Setiawan 11";
        String gender = "Male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }
}
