package com.zdxh.controller;

import com.zdxh.entity.TUser;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;


public class UseremailRunnable implements  Runnable {
    private TUser tUser;
    private JavaMailSender javaMailSender;
    private TemplateEngine templateEngine;

    public UseremailRunnable(TUser tUser, JavaMailSender javaMailSender, TemplateEngine templateEngine){
        this.tUser =tUser;
        this.javaMailSender=javaMailSender;
        this.templateEngine=templateEngine;
    }
    @Override
    public void run(){
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(tUser.getUserEmail());
            helper.setFrom("2415219566@qq.com");
            helper.setSubject("企业管理网：");
            Context ctx = new Context();
            ctx.setVariable("name", tUser.getUserUsername());
            String mail =templateEngine.process("/robot/email.html",ctx);
            helper.setText(mail,true);
            javaMailSender.send(message);
        }catch (javax.mail.MessagingException e){
            System.out.println("发送失败");
            e.printStackTrace();
        }
    }

}
