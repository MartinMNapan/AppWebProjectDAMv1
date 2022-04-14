package pe.idat.edu.project.appwebprojectdamv1.ui.kilometraje;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentKilometrajeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;
    //
    public FragmentKilometrajeViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Kilometraje.....//....");
    }
    //
    public LiveData<String> getText() {
        return mText;
    }
}