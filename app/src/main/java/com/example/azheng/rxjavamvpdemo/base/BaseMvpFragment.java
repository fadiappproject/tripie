package com.example.azheng.rxjavamvpdemo.base;

/**
 * @author azheng
 * @date 2018/4/24.
 * Description：
 */
public abstract class BaseMvpFragment<T extends BasePresenter>  extends BaseFragment implements BaseView{

    protected T mPresenter;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroyView();
    }
}
