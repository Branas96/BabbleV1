package networks.computer.babble;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
/**
 * Created by braam on 2017/09/03.
 */

public class Home extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.mCustomToolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setTitle("Chats");
    }
}
