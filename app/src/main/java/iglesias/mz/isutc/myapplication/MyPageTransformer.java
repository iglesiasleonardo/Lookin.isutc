package iglesias.mz.isutc.myapplication;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by igles on 06 Apr 2018.
 */

class MyPageTransformer implements ViewPager.PageTransformer {
    private View conjuntoBotoes1;
    private View conjuntoBotoes2;
    private View conjuntoBotoes3;

    public void transformPage(View pagina, float position) {
        int posicaoPagina = (int) pagina.getTag();
        
        if (position <= -1 || position >= 1) {
        } else if( position == 0 ) {
        } else {
            if(posicaoPagina==0){
                conjuntoBotoes1 = pagina.findViewById(R.id.conjuntoBotoes1);
                conjuntoBotoes1.setTranslationX(-position * pagina.getWidth());
            }
            if(posicaoPagina==1){
                conjuntoBotoes2= pagina.findViewById(R.id.conjuntoBotoes2);
                conjuntoBotoes2.setTranslationX(-position * pagina.getWidth());
            }
            if(posicaoPagina==2){
                conjuntoBotoes3=pagina.findViewById(R.id.conjuntoBotoes3);
                conjuntoBotoes3.setTranslationX(-position * pagina.getWidth());
            }
        }
    }
}
