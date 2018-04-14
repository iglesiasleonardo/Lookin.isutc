package iglesias.mz.isutc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by igles on 05 Apr 2018.
 */

public class IntroFragment extends Fragment{
    private static final String PAGINA = "page";
    private int mPagina;

    public static IntroFragment novaInstancia(int pagina) {
        IntroFragment frag = new IntroFragment();
        Bundle b = new Bundle();//Criar Bundle para trocar componentes
        b.putInt(PAGINA, pagina);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getArguments().containsKey(PAGINA))
            throw new RuntimeException("O fragmento deve conter um argumento \"" + PAGINA + "\"");
        mPagina = getArguments().getInt(PAGINA);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Selecionar um layout baseado na pagina corrente
        int layoutResId;
        switch (mPagina) {
            case 0:
                layoutResId = R.layout.fragment_layout1;
                break;
            case 1:
                layoutResId = R.layout.fragment_layout2;
                break;
            default:
                layoutResId = R.layout.fragment_layout3;
        }

        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(layoutResId, container, false);

        //Definir o index da pagina corrente como uma Tag da View (vai ser utilizado em PageTransformer)
        view.setTag(mPagina);
        return view;
    }

}
