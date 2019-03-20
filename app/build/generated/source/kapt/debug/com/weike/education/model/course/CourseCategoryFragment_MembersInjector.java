// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.model.course;

import com.weike.education.base.BaseInjectFragment_MembersInjector;
import com.weike.education.mvp.presenter.course.CourseCategoryPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class CourseCategoryFragment_MembersInjector
    implements MembersInjector<CourseCategoryFragment> {
  private final Provider<CourseCategoryPresenter> mPresenterProvider;

  public CourseCategoryFragment_MembersInjector(
      Provider<CourseCategoryPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<CourseCategoryFragment> create(
      Provider<CourseCategoryPresenter> mPresenterProvider) {
    return new CourseCategoryFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(CourseCategoryFragment instance) {
    BaseInjectFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
