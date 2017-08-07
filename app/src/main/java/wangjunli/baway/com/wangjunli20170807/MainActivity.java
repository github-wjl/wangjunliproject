package wangjunli.baway.com.wangjunli20170807;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Title.topbarClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏actionBar
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        Title gg=(Title)findViewById(R.id.myView);
        gg.setListener(this);
    }

    @Override
    public void LeftClickListener(View view) {
        Toast.makeText(MainActivity.this,"对返回的具体操作",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void RightClickListener(View view) {
        Toast.makeText(MainActivity.this,"对更多的具体操作",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void TitleClickListener(View view) {
        Toast.makeText(MainActivity.this,"对标题的具体操作",Toast.LENGTH_SHORT).show();
    }
}
