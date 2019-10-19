package com.tracholar.articlerecsys;

import com.tracholar.articlerecsys.data.Article;
import com.tracholar.recommend.data.HasId;
import com.tracholar.recommend.engine.DetailFetcher;

import java.util.ArrayList;
import java.util.List;

public class ArticleFetcher implements DetailFetcher<Article> {

    public List<Article> fetchDetail(List<HasId> arr){
        List<Article> articles = new ArrayList<>();
        for(HasId s : arr) {
            articles.add(new Article((Long) s.getId(), "文章标题"));
        }

        return articles;
    }

}
