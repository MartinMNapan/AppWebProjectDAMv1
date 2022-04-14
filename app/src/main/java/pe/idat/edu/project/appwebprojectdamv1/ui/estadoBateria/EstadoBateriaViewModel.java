package pe.idat.edu.project.appwebprojectdamv1.ui.estadoBateria;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EstadoBateriaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;
    //
    public EstadoBateriaViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Estado Bateria.....//....");
    }
    //
    public LiveData<String> getText() {
        return mText;
    }

}