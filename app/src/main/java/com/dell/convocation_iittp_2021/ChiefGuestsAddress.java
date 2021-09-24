package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.style.BulletSpan;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class ChiefGuestsAddress extends AppCompatActivity {
    String s1 = "Good Morning," +
            "\n\t●\t Shri Amit Khare, IAS, Secretary, Ministry of Education, Government of India and Chairman, Board of Governors, IIT Tirupati" +
            "\n\t●\t Members, Board of Governors, IIT Tirupati" +
            "\n\t●\t Dr. K N Satyanarayana, Director, IIT – Tirupati" +
            "\n\t●\t The Stars of the evening – the Graduates, who have successfully navigated many years in this Institution" +
            "\n\t●\t The Student Council and most importantly" +
            "\n\t●\t Deans, Faculty, Heads of Departments, and Staff who are responsible for nurturing the superstars, Ladies and Gentlemen,"
            + "\n\n At the outset, my congratulations to the Graduates of the Institution. It is an important occasion that you are passing out from IIT – Tirupati at a time when the Institute has started spreading its wings and scaling new heights" +
            "\n\n Over the next 20 minutes, I am going to sketch an outline of few organizing principles that will help the graduates to navigate in this world of Volatility, Uncertainty, Complexity and Ambiguity." +
            "\n\n That you have passed out from the # 1 Engineering Institution in India will not automatically guarantee success in life." +
            "\n\n Louis Pasteur said, “Chance Favours the Prepared Mind”. This is your chance now. Are you prepared? This is the crucial question that you must ask yourself and what does being Prepared mean?" +
            "\n\n Over the last three decades, I have had the privilege of being in the network of truly gifted individuals. First, as fellow students in IIT, then as colleagues, competitors and friends. Some have converted half chances and opportunities that came their way and achieved great recognition, fame and wealth. But many did not realize their inherent potential. What makes Chief Guest’s Address the difference? Why are there such variations in outcomes despite nearly identical academic & social backgrounds and comparable start?" +
            "\n\n In my experience, I have noticed that the fundamental differences amongst individuals are minuscule. But over a lifetime, these infinitesimal differences cumulate gradually and imperceptibly. The result is that some are spectacularly successful, others, not so. To me, this boils down to cultivating, developing in a purposeful way, a set of principles and approaches that will enable you to be successful in whatever you choose to be, be it a professional, an entrepreneur, an author, a researcher or social activist." +
            "\n\n ‘What got you in here won’t get you there’ – the journey you’re about to embark on is dramatically different from the one you’ve taken so far. Gone are the final exams, semester breaks, thesis proposals, and internships – the discrete blocks that have dominated your lives so far will morph into an ambiguous path that may resemble a drunkard’s random walk. The short-term approach to learning, performing and graduating with nudges from an ecosystem of parents, professors, and fellow students transform into a vast horizon with deceptively fluid timelines. Learning is no longer about the result, but about the journey itself." +
            "\n\n I have put these principles together into what I call the STAY framework. It offers 4 simple verbs to guide you STAY –" +
            "\n\t●\t Immersed" +
            "\n\t●\t Relevant" +
            "\n\t●\t Connected" +
            "\n\t●\t Organized" +
            "Whatever you choose as your career, you will experience change and uncertainty and will be unsure how to navigate the path to your goals and ambitions. The STAY framework can serve as your radar chart to help you evaluate where you stand at critical moments in your journey.";

    String s2 = "At the start of your journey, as Dick Cheney, former Vice President – USA states, it’s critical to recognise that your path is littered with Known Unknowns and Unknown Unknowns. The random walk of life may take you to places where you might consider not worth investing. You will come across a task or project that may seem to be at odds with your ambition. Nearly four decades ago, a required course on psychology in my final year seemed irrelevant to someone keen to perform Fourier Transforms and advanced structural analysis. Today, most of the work I do in running an enterprise involves understanding the motivations and biases of my colleagues and competitors. It is cognitive sciences all the way. The first rule, therefore, is to Suspend Judgment and Immerse Yourself. “You Don’t Know What You Don’t Know”." +
            "\n \n  Immersion (or learning) requires intense concentration and deliberate practice. Deliberate Practice, a theory of learning and improvement pioneered by cognitive scientist K Anders Ericsson, helps one to learn through focussed attention, on specific tasks coupled with feedback to measure and improve performance. The theory of deliberate practice has been validated in diverse fields such as sports, music, chess, research, entrepreneurship, etc., by several studies of elite performers. Deliberate Practice is what differentiates Sachin’s accomplishments from Kambli’s"
            + "\n\n What is commonly known as the 10000-Hour Rule for building expertise is actually the compounding effect of deliberate practice. Compounding is well understood in the realm of finance, but the domain dependence of our minds sometimes misses the fact that the same principles apply to skills, knowledge, and expertise acquisition. Little do we realise that a mere 0.1% improvement in a day-to-day activity results in over 500% improvement in just 5 years. Harness the power of compounding and deliberate practice! Immerse yourself! Suspend Judgement! Become an expert.";

    String s3 = "To stay immersed, you will need help. Fortunately, we all live in an era where access to good advice, tools, and techniques is merely a swipe away. The writer and computer scientist Cal Newport, famous for his Deep Work philosophy, advocates applying your entire attention and focus to a problem at hand and working in a distraction-free environment. Quality work, he says, is the product of two variables – the time spent multiplied by the intensity of focus. This, he believes, is the only antidote to shortening attention spans, an inability among many people today to focus and maintain concentration without craving distraction every few minutes. His suggestion, adapted from the work of Clayton Christensen (a well-known scholar of innovation and disruption) is two-fold."
            + "\n \n As an example, he uses the example of a researcher who desired to publish 5 papers in important journals during the course of a single year. For her, this was a stretch goal because she had only managed to publish 4 in a year previously. The Researcher focussed on how many hours of deep, uninterrupted, fully-focussed work that she did towards these papers. By tracking the number of hours (which she knew was a good proxy for the goal), she could tell how well she was doing overtime." ;

    String s4 = "Immersion allows you to build depth in your chosen field. Over time, it is also necessary to develop an awareness of the adjacencies to your expertise area. This requires you to cultivate the Habit of Curiosity, which manifests itself as continuous learning in those connected but adjacent subjects, enabling you to connect the dots and see the big picture. You build breadth while maintaining your depth. This makes you a T-shaped professional, who has developed an uncanny ability to collaborate across disciplines with experts in other areas and apply knowledge in areas of expertise other than your own. The T-shaped individual was a concept internally used by McKinsey, but popularised by Tim Brown, the CEO of IDEO Design Consultancy. Essentially, for you to stay relevant in fields that are going through rapid transformations, you need to become a “Generalising Specialist”" ;

    String s5 = "Seventeen years ago, in my acceptance speech at IIT-M when I received the Distinguished Alumnus Award, I said that what I had learned in IIT was to compete and fiercely at that. It was Professor Ananth, the then Director, IIT-M, who corrected me by saying, “Santhanam – you don’t compete with others, you compete with yourself, and you work with others”. How insightful! Being narrowly competitive no longer guarantees success. The ability to collaborate is now an absolute necessity. It was the World Wide Web initially; later Cloud and now Social media that bind us together to form a large complex network." +
            "\n\n In this networked world, being connected to those who are influential in your field and adjacencies are central to bringing you opportunities. This cannot be happenstance but has to be deliberately cultivated." +
            "\n\n Ten years ago, we carried out the IIT Impact Study. Of the ET-500 companies, more than 450 had at least one director as an IIT-an. The IIT Alumni network today is made up of powerful and influential leaders of the industry. You’ve earned the right to be a part of this network. Connect & Leverage this network. Find a mentor, locate a sponsor, build the contacts that you can tap for a lifetime." +
            "\n\n There are many other industry networks - Young Indians, Startapreneurs Network, TiE, CII, etc - each of them enhances the quality and amplifies the quantity of opportunities that come your way. A curious mind can connect the dots among these opportunities and your capabilities." +
            "\n\n“Networks amplify your power of reach and multiplies the opportunities that chance brings to you.”" +
            "\n\nTo sum up, the four organising principles that will help you navigate the VUCA world:" +
            "\n\t●\t Stay Immersed - Let the power of compounding and deliberate practice work in your favour" +
            "\n\t●\t Stay Organised – Eliminate distraction, perform deep work as you build your expertise." +
            "\n\t●\t Stay Relevant - Be curious and seek width and breadth simultaneously. Connect the dots through a broad understanding of adjacencies and coupled with the depth of expertise in specific areas. Essentially become a T – shaped individual." +
            "\n\t●\t Stay Connected – Systematically build your network and leverage the IIT Alumni community." +
            "\n\n In my experience, the organising principles that I have talked about so far are, characteristics that must be developed – none of them is an inborn talent. So in order to be successful, most of what you need is learned. If you look at it in another way, these are habits and principles that you learn and practice constantly all through your journey, until they become an integral part of your life. You will have to create the necessary momentum from “with in” to build on these principles that determine your progress in this interesting, but intensely competitive world, full of Opportunities." +
            "\n\n Good Luck and best wishes." ;


    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_of_honour);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setTitle("Chief Guest's Address");
        t1 = findViewById(R.id.t1);
        t3 = findViewById(R.id.academic_programs);
        t4 = findViewById(R.id.covid_crises);
        t5 = findViewById(R.id.sponsored_research);
        t6 = findViewById(R.id.distinctions);
        t1.setText(s1);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        t3.setText(s2);
        t4.setText(s3);
        t5.setText(s4);
        t6.setText(s5);

    }

    public void left(View view) {
        finish();
    }
}