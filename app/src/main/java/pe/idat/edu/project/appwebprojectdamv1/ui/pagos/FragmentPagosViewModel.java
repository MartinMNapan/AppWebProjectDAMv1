package pe.idat.edu.project.appwebprojectdamv1.ui.pagos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentPagosViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;
    //
    public FragmentPagosViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Pagos.....//....");
    }
    //
    public LiveData<String> getText() {
        return mText;
    }
}