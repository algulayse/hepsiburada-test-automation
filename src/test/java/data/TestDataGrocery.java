package data;

import org.json.JSONObject;

    public class TestDataGrocery {
        /*
      { "id": 4,
        "name": "string",
        "price": 12.3,
        "stock": 3 }
         */
        public JSONObject setUpTestData() {
            JSONObject json = new JSONObject();
            json.put("id", 4);
            json.put("name", "string");
            json.put("price", 12);
            json.put("stock", 3);
            return json;

    }

}
