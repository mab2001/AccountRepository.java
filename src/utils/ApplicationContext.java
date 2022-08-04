package utils;

import repository.*;

import java.util.Scanner;

public class ApplicationContext {

    private static final DataBaseInitializer databaseinitializer = new DataBaseInitializer();
    private static final DataInitializar datainitializer = new DataInitializar();
    private static final Menu menu = new Menu();
    private static final Scanner stringScanner = new Scanner(System.in);
    private static final Scanner numberScanner = new Scanner(System.in);
    private static final AccountRepository accountRepository = new AccountRepository();
    private static final AdminRepository adminRepository = new AdminRepository();
    private static final BannedRepository bannedRepository = new BannedRepository();
    private static final BlockRepository blockRepository = new BlockRepository();
    private static final CloseFriendRepository closeFriendRepository = new CloseFriendRepository();
    private static final CommentRepository commentRepository = new CommentRepository();
    private static final FavoriteRepository favoriteRepository = new FavoriteRepository();
    private static final FollowRepository followRepository = new FollowRepository();
    private static final GmailRepository gmailRepository = new GmailRepository();
    private static final GroupMessageRepository groupMessageRepository = new GroupMessageRepository();
    private static final GroupRepository groupRepository = new GroupRepository();
    private static final KickedRepository kickedRepository = new KickedRepository();
    private static final LikeCommentRepository likeCommentRepository = new LikeCommentRepository();
    private static final LikesPostRepository likesPostRepository = new LikesPostRepository();
    private static final MemberRepository memberRepository = new MemberRepository();
    private static final MutedRepository mutedRepository = new MutedRepository();
    private static final PagesViewRepository pagesViewRepository = new PagesViewRepository();
    private static final PostRepository postRepository = new PostRepository();
    private static final PrivateChatMessageRepository privateChatMessageRepository = new PrivateChatMessageRepository();
    private static final ProfileRepository profileRepository = new ProfileRepository();
    private static final ReportedRepository reportedRepository = new ReportedRepository();
    private static final SmsRepository smsRepository = new SmsRepository();
    private static final ViewPostRepository viewPostRepository = new ViewPostRepository();
    public static DataBaseInitializer getDatabaseinitializer() {
        return databaseinitializer;
    }
    public static DataInitializar getDatainitializer() {
        return datainitializer;
    }

    public static AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public static AdminRepository getAdminRepository() {
        return adminRepository;
    }

    public static BannedRepository getBannedRepository() {
        return bannedRepository;
    }

    public static BlockRepository getBlockRepository() {
        return blockRepository;
    }

    public static CloseFriendRepository getCloseFriendRepository() {
        return closeFriendRepository;
    }

    public static CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public static FavoriteRepository getFavoriteRepository() {
        return favoriteRepository;
    }

    public static FollowRepository getFollowRepository() {
        return followRepository;
    }

    public static GmailRepository getGmailRepository() {
        return gmailRepository;
    }

    public static GroupMessageRepository getGroupMessageRepository() {
        return groupMessageRepository;
    }

    public static GroupRepository getGroupRepository() {
        return groupRepository;
    }

    public static KickedRepository getKickedRepository() {
        return kickedRepository;
    }

    public static LikeCommentRepository getLikeCommentRepository() {
        return likeCommentRepository;
    }

    public static LikesPostRepository getLikesPostRepository() {
        return likesPostRepository;
    }

    public static MemberRepository getMemberRepository() {
        return memberRepository;
    }

    public static MutedRepository getMutedRepository() {
        return mutedRepository;
    }

    public static PagesViewRepository getPagesViewRepository() {
        return pagesViewRepository;
    }

    public static PostRepository getPostRepository() {
        return postRepository;
    }

    public static PrivateChatMessageRepository getPrivateChatMessageRepository() {
        return privateChatMessageRepository;
    }

    public static ProfileRepository getProfileRepository() {
        return profileRepository;
    }

    public static ReportedRepository getReportedRepository() {
        return reportedRepository;
    }

    public static Scanner getNumberScanner() {
        return numberScanner;
    }

    public static Scanner getStringScanner() {
        return stringScanner;
    }

    public static SmsRepository getSmsRepository() {
        return smsRepository;
    }

    public static ViewPostRepository getViewPostRepository() {
        return viewPostRepository;
    }

    public static Menu getMenu() {
        return menu;
    }
}
