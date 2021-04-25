import axios from 'axios'



const STORE_REST_API_URL = 'http://localhost:8080/carslist'

class StoreServices{
    getStores(){
        return axios.get(STORE_REST_API_URL);
    }
}
export default new StoreServices();