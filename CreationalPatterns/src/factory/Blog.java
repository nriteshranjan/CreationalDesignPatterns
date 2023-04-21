package factory;

import factory.PageType.AboutPage;
import factory.PageType.CommentPage;
import factory.PageType.ContactPage;
import factory.PageType.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
