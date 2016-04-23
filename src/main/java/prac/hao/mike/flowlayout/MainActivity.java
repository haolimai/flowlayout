package prac.hao.mike.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import prac.hao.mike.flowlayout.view.FlowLayout;

public class MainActivity extends AppCompatActivity {
    private FlowLayout fl_layout;
    private String[] tags = {
            "阳光灿烂的日子", "I Believe 2", "life of pi", "撒哈拉的故事",
            "轨迹", "晴天", "你听得到", "壮志在我胸","我的热情不会冷却"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_layout = (FlowLayout) findViewById(R.id.fl_layout);

        LayoutInflater li = LayoutInflater.from(this);
        for (int i = 0;i < tags.length;i++) {
            TextView tv = (TextView) li.inflate(R.layout.tv,fl_layout,false);
            tv.setText(tags[i]);
            fl_layout.addView(tv);
        }
    }
}
