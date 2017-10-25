import android.test.AndroidTestCase;

import com.example.mohamed.builditbiggerapp.model.JokeAsyncTask;

/**
 * Created by mohamed on 25/10/2017.
 */

public class JokeAsyncTest extends AndroidTestCase {
    @SuppressWarnings("unchecked")
    public void test() {
        String value = null;
        JokeAsyncTask jokeAsyncTask=new JokeAsyncTask();
        jokeAsyncTask.execute(getContext());
        try {
            value = jokeAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(value);
    }

}
