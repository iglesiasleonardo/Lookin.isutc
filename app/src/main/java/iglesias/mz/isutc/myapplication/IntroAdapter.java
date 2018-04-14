package iglesias.mz.isutc.myapplication;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by igles on 05 Apr 2018.
 */

class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pagina) {
        switch (pagina){
            case 0:
                return IntroFragment.novaInstancia(pagina);
            case 1:
                return IntroFragment.novaInstancia(pagina);
            default:
                return IntroFragment.novaInstancia(pagina);
        }
    }

    @Override
    public int getCount() {
        return 3;//Numero de Fragmentos
    }
}
