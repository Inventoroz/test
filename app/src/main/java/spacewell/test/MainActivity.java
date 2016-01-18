package spacewell.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.nio.ByteBuffer;


public class MainActivity extends Activity
{
    public static final int OP_READ = 1;
    public static final int OP_WRITE = 4;
    public static final int OP_CONNECT = 8;
    public static final int OP_ACCEPT = 16;

    private int base;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = base | OP_READ;
        Log.d("TEST1", "" + base);
        base = base | OP_WRITE;
        Log.d("TEST2", "" + base);
        base = base | OP_CONNECT;
        Log.d("TEST3", "" + base);
        base = base | OP_ACCEPT;
        Log.d("TEST4", "" + base);

        Log.d("TEST5", "" + (base & OP_READ));
        Log.d("TEST6", "" + (base & OP_WRITE));
        Log.d("TEST7", "" + (base & OP_CONNECT));
        Log.d("TEST8", "" + (base & OP_ACCEPT));

        Log.d("TEST9", "" + (base ^ OP_READ));
        Log.d("TEST10", "" + (base & ~OP_READ));

        ByteBuffer byteBuffer;
    }
}
