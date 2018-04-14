package iglesias.mz.isutc.myapplication;

import android.graphics.PorterDuff;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static android.graphics.Color.rgb;

public class IntroActivity extends AppCompatActivity {
    private ViewPager mViewPager;//Sorry teacher we rather program in english, makes more sense kkk
    private Button entrar;
    private Button cadastrar;
    private Button cadastrarGoogle;
    private Button cadastrar2;
    private Button cadastrarGoogle2;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_layout);

        cadastrar = (Button) findViewById(R.id.cadastrar);
        cadastrarGoogle = (Button) findViewById(R.id.cadastrarG);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        //Definicao do responsavel pelas visualizações das paginas
        mViewPager.setAdapter(new IntroAdapter(getSupportFragmentManager()));

        mViewPager.setPageTransformer(false, new MyPageTransformer());

        entrar = (Button) findViewById(R.id.entrar);
    }

}
