package org.Example_one_to_many_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class one_to_many {
    public static void main(String[] args) {
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hybernate/hibernate.cfg.xml").build();
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session session=factory.openSession();

        Transaction t=session.beginTransaction();
        Answer an1=new Answer();
        an1.setAnswername("Java is a programming language");
        an1.setPostedBy("Ravi Malik");

        Answer an2=new Answer();
        an2.setAnswername("Java is a platform");
        an2.setPostedBy("Sudhir Kumar");

        Question q1=new Question();
        q1.setName("What is Java?");
        ArrayList<Answer> l1=new ArrayList<Answer>();
        l1.add(an1);
        l1.add(an2);
        q1.setAnswers(l1);


        Answer ans3=new Answer();
        ans3.setAnswername("Servlet is an Interface");
        ans3.setPostedBy("Jai Kumar");

        Answer ans4=new Answer();
        ans4.setAnswername("Servlet is an API");
        ans4.setPostedBy("Arun");

        Question q2=new Question();
        q2.setName("What is Servlet?");
        ArrayList<Answer> l2=new ArrayList<Answer>();
        l2.add(ans3);
        l2.add(ans4);
        q2.setAnswers(l2);

        session.save(q1);
        session.save(q2);

        t.commit();
        System.out.println("Insertion success");

        TypedQuery query=session.createQuery("from Question");
        List<Question> list=query.getResultList();

        Iterator<Question> itr=list.iterator();
        while(itr.hasNext()){
            Question q=itr.next();
            System.out.println("Question Name: "+q.getName());

            //printing answers
            List<Answer> list3=q.getAnswers();
            Iterator<Answer> itr2=list3.iterator();
            while(itr2.hasNext())
            {
                Answer a=itr2.next();
                System.out.println(a.getAnswername()+":"+a.getPostedBy());
            }
        }
        session.close();

    }
}
