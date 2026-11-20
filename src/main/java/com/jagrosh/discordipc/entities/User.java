package com.jagrosh.discordipc.entities;

import com.jagrosh.discordipc.impl.ExtendedLong;

public class User {
    public String username;
    public String nickname;
    public String discriminator;
    public long f002;
    public String avatar;

    public User(String var1, String var2, String var3, long var4, String var6) {
        this.username = var1;
        this.nickname = var2;
        this.discriminator = var3;
        this.f002 = var4;
        this.avatar = var6;
    }

    public String getName() {
        return this.username;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getEffectiveName() {
        return this.nickname == null ? this.username : this.nickname;
    }

    public String getDiscriminator() {
        return this.discriminator;
    }

    public long getIdLong() {
        return this.f002;
    }

    public String getId() {
        return Long.toString(this.f002);
    }

    public String getAvatarId() {
        return this.avatar;
    }

    public String getAvatarUrl() {
        return this.getAvatarId() == null
            ? null
            : "https://cdn.discordapp.com/avatars/" + this.getId() + "/" + this.getAvatarId() + (this.getAvatarId().startsWith("a_") ? ".gif" : ".png");
    }

    public String getDefaultAvatarId() {
        return User.DefaultAvatar.values()[(this.getDiscriminator().equals("0") ? (int)this.getIdLong() >> 22 : Integer.parseInt(this.getDiscriminator()))
                % User.DefaultAvatar.values().length]
            .toString();
    }

    public String getDefaultAvatarUrl() {
        return "https://discord.com/assets/" + this.getDefaultAvatarId() + ".png";
    }

    public String getEffectiveAvatarUrl() {
        return this.getAvatarUrl() == null ? this.getDefaultAvatarUrl() : this.getAvatarUrl();
    }

    public boolean isBot() {
        return false;
    }

    public String getAsMention() {
        return "<@" + this.f002 + '>';
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof User)) {
            return false;
        } else {
            User var2 = (User)var1;
            return this == var2 || this.f002 == var2.f002;
        }
    }

    @Override
    public int hashCode() {
        return ExtendedLong.hashCode(this.f002);
    }

    @Override
    public String toString() {
        return "U:" + this.getName() + '(' + this.f002 + ')';
    }

    public static enum DefaultAvatar {
        BLURPLE("6debd47ed13483642cf09e832ed0bc1b"),
        GREY("322c936a8c8be1b803cd94861bdfa868"),
        GREEN("dd4dbc0016779df1378e7812eabaa04d"),
        ORANGE("0e291f67c9274a1abdddeb3fd919cbaa"),
        RED("1cbd08c76f8af6dddce02c5138971129");

        public String text;

        DefaultAvatar(String var3) {
            this.text = var3;
        }

        @Override
        public String toString() {
            return this.text;
        }
    }
}
