package article;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.BlogserverApplication;
import org.sang.bean.Article;
import org.sang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogserverApplication.class)
public class ArticleTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void insertTest() {
        Article article = new Article();
        article.setTitle("hello unit test");
        article.setMdContent("unit test");
        article.setHtmlContent("wzh shuai");
        article.setState(1);
        article.setId(-1L);
        articleService.addNewArticle(article);
    }

}
