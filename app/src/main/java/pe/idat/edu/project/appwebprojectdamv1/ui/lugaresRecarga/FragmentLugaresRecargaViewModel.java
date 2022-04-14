package pe.idat.edu.project.appwebprojectdamv1.ui.lugaresRecarga;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentLugaresRecargaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;
    //
    public FragmentLugaresRecargaViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Lugares de Recarga.....//....");
    }
    //
    public LiveData<String> getText() {
        return mText;
    }
}