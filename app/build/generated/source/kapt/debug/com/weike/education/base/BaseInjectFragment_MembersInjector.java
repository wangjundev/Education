// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.base;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseInjectFragment_MembersInjector<T extends BaseContract.BasePresenter<?>>
    implements MembersInjector<BaseInjectFragment<T>> {
  private final Provider<T> mPresenterProvider;

  public BaseInjectFragment_MembersInjector(Provider<T> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <T extends BaseContract.BasePresenter<?>>
      MembersInjector<BaseInjectFragment<T>> create(Provider<T> mPresenterProvider) {
    return new BaseInjectFragment_MembersInjector<T>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseInjectFragment<T> instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static <T extends BaseContract.BasePresenter<?>> void injectMPresenter(
      BaseInjectFragment<T> instance, T mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
