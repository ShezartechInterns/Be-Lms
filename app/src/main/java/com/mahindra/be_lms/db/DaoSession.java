package com.mahindra.be_lms.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig companyDaoConfig;
    private final DaoConfig designationDaoConfig;
    private final DaoConfig locationDaoConfig;
    private final DaoConfig qualificationDaoConfig;
    private final DaoConfig profileDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig productDaoConfig;
    private final DaoConfig modelDaoConfig;
    private final DaoConfig categoryDaoConfig;
    private final DaoConfig subCategoryDaoConfig;
    private final DaoConfig documentTreeDaoConfig;
    private final DaoConfig queriesDaoConfig;
    private final DaoConfig queryResponseDaoConfig;
    private final DaoConfig eventDaoConfig;
    private final DaoConfig courseDaoConfig;
    private final DaoConfig coordinatorsDaoConfig;
    private final DaoConfig trainersDaoConfig;
    private final DaoConfig documentDaoConfig;
    private final DaoConfig notificationsDaoConfig;
    private final DaoConfig technicalUploadDaoConfig;
    private final DaoConfig menuRightsDaoConfig;

    private final CompanyDao companyDao;
    private final DesignationDao designationDao;
    private final LocationDao locationDao;
    private final QualificationDao qualificationDao;
    private final ProfileDao profileDao;
    private final UserDao userDao;
    private final ProductDao productDao;
    private final ModelDao modelDao;
    private final CategoryDao categoryDao;
    private final SubCategoryDao subCategoryDao;
    private final DocumentTreeDao documentTreeDao;
    private final QueriesDao queriesDao;
    private final QueryResponseDao queryResponseDao;
    private final EventDao eventDao;
    private final CourseDao courseDao;
    private final CoordinatorsDao coordinatorsDao;
    private final TrainersDao trainersDao;
    private final DocumentDao documentDao;
    private final NotificationsDao notificationsDao;
    private final TechnicalUploadDao technicalUploadDao;
    private final MenuRightsDao menuRightsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        companyDaoConfig = daoConfigMap.get(CompanyDao.class).clone();
        companyDaoConfig.initIdentityScope(type);

        designationDaoConfig = daoConfigMap.get(DesignationDao.class).clone();
        designationDaoConfig.initIdentityScope(type);

        locationDaoConfig = daoConfigMap.get(LocationDao.class).clone();
        locationDaoConfig.initIdentityScope(type);

        qualificationDaoConfig = daoConfigMap.get(QualificationDao.class).clone();
        qualificationDaoConfig.initIdentityScope(type);

        profileDaoConfig = daoConfigMap.get(ProfileDao.class).clone();
        profileDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        productDaoConfig = daoConfigMap.get(ProductDao.class).clone();
        productDaoConfig.initIdentityScope(type);

        modelDaoConfig = daoConfigMap.get(ModelDao.class).clone();
        modelDaoConfig.initIdentityScope(type);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        subCategoryDaoConfig = daoConfigMap.get(SubCategoryDao.class).clone();
        subCategoryDaoConfig.initIdentityScope(type);

        documentTreeDaoConfig = daoConfigMap.get(DocumentTreeDao.class).clone();
        documentTreeDaoConfig.initIdentityScope(type);

        queriesDaoConfig = daoConfigMap.get(QueriesDao.class).clone();
        queriesDaoConfig.initIdentityScope(type);

        queryResponseDaoConfig = daoConfigMap.get(QueryResponseDao.class).clone();
        queryResponseDaoConfig.initIdentityScope(type);

        eventDaoConfig = daoConfigMap.get(EventDao.class).clone();
        eventDaoConfig.initIdentityScope(type);

        courseDaoConfig = daoConfigMap.get(CourseDao.class).clone();
        courseDaoConfig.initIdentityScope(type);

        coordinatorsDaoConfig = daoConfigMap.get(CoordinatorsDao.class).clone();
        coordinatorsDaoConfig.initIdentityScope(type);

        trainersDaoConfig = daoConfigMap.get(TrainersDao.class).clone();
        trainersDaoConfig.initIdentityScope(type);

        documentDaoConfig = daoConfigMap.get(DocumentDao.class).clone();
        documentDaoConfig.initIdentityScope(type);

        notificationsDaoConfig = daoConfigMap.get(NotificationsDao.class).clone();
        notificationsDaoConfig.initIdentityScope(type);

        technicalUploadDaoConfig = daoConfigMap.get(TechnicalUploadDao.class).clone();
        technicalUploadDaoConfig.initIdentityScope(type);

        menuRightsDaoConfig = daoConfigMap.get(MenuRightsDao.class).clone();
        menuRightsDaoConfig.initIdentityScope(type);

        companyDao = new CompanyDao(companyDaoConfig, this);
        designationDao = new DesignationDao(designationDaoConfig, this);
        locationDao = new LocationDao(locationDaoConfig, this);
        qualificationDao = new QualificationDao(qualificationDaoConfig, this);
        profileDao = new ProfileDao(profileDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        productDao = new ProductDao(productDaoConfig, this);
        modelDao = new ModelDao(modelDaoConfig, this);
        categoryDao = new CategoryDao(categoryDaoConfig, this);
        subCategoryDao = new SubCategoryDao(subCategoryDaoConfig, this);
        documentTreeDao = new DocumentTreeDao(documentTreeDaoConfig, this);
        queriesDao = new QueriesDao(queriesDaoConfig, this);
        queryResponseDao = new QueryResponseDao(queryResponseDaoConfig, this);
        eventDao = new EventDao(eventDaoConfig, this);
        courseDao = new CourseDao(courseDaoConfig, this);
        coordinatorsDao = new CoordinatorsDao(coordinatorsDaoConfig, this);
        trainersDao = new TrainersDao(trainersDaoConfig, this);
        documentDao = new DocumentDao(documentDaoConfig, this);
        notificationsDao = new NotificationsDao(notificationsDaoConfig, this);
        technicalUploadDao = new TechnicalUploadDao(technicalUploadDaoConfig, this);
        menuRightsDao = new MenuRightsDao(menuRightsDaoConfig, this);

        registerDao(Company.class, companyDao);
        registerDao(Designation.class, designationDao);
        registerDao(Location.class, locationDao);
        registerDao(Qualification.class, qualificationDao);
        registerDao(Profile.class, profileDao);
        registerDao(User.class, userDao);
        registerDao(Product.class, productDao);
        registerDao(Model.class, modelDao);
        registerDao(Category.class, categoryDao);
        registerDao(SubCategory.class, subCategoryDao);
        registerDao(DocumentTree.class, documentTreeDao);
        registerDao(Queries.class, queriesDao);
        registerDao(QueryResponse.class, queryResponseDao);
        registerDao(Event.class, eventDao);
        registerDao(Course.class, courseDao);
        registerDao(Coordinators.class, coordinatorsDao);
        registerDao(Trainers.class, trainersDao);
        registerDao(Document.class, documentDao);
        registerDao(Notifications.class, notificationsDao);
        registerDao(TechnicalUpload.class, technicalUploadDao);
        registerDao(MenuRights.class, menuRightsDao);
    }

    public void clear() {
        companyDaoConfig.getIdentityScope().clear();
        designationDaoConfig.getIdentityScope().clear();
        locationDaoConfig.getIdentityScope().clear();
        qualificationDaoConfig.getIdentityScope().clear();
        profileDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        productDaoConfig.getIdentityScope().clear();
        modelDaoConfig.getIdentityScope().clear();
        categoryDaoConfig.getIdentityScope().clear();
        subCategoryDaoConfig.getIdentityScope().clear();
        documentTreeDaoConfig.getIdentityScope().clear();
        queriesDaoConfig.getIdentityScope().clear();
        queryResponseDaoConfig.getIdentityScope().clear();
        eventDaoConfig.getIdentityScope().clear();
        courseDaoConfig.getIdentityScope().clear();
        coordinatorsDaoConfig.getIdentityScope().clear();
        trainersDaoConfig.getIdentityScope().clear();
        documentDaoConfig.getIdentityScope().clear();
        notificationsDaoConfig.getIdentityScope().clear();
        technicalUploadDaoConfig.getIdentityScope().clear();
        menuRightsDaoConfig.getIdentityScope().clear();
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public DesignationDao getDesignationDao() {
        return designationDao;
    }

    public LocationDao getLocationDao() {
        return locationDao;
    }

    public QualificationDao getQualificationDao() {
        return qualificationDao;
    }

    public ProfileDao getProfileDao() {
        return profileDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public ModelDao getModelDao() {
        return modelDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public SubCategoryDao getSubCategoryDao() {
        return subCategoryDao;
    }

    public DocumentTreeDao getDocumentTreeDao() {
        return documentTreeDao;
    }

    public QueriesDao getQueriesDao() {
        return queriesDao;
    }

    public QueryResponseDao getQueryResponseDao() {
        return queryResponseDao;
    }

    public EventDao getEventDao() {
        return eventDao;
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public CoordinatorsDao getCoordinatorsDao() {
        return coordinatorsDao;
    }

    public TrainersDao getTrainersDao() {
        return trainersDao;
    }

    public DocumentDao getDocumentDao() {
        return documentDao;
    }

    public NotificationsDao getNotificationsDao() {
        return notificationsDao;
    }

    public TechnicalUploadDao getTechnicalUploadDao() {
        return technicalUploadDao;
    }

    public MenuRightsDao getMenuRightsDao() {
        return menuRightsDao;
    }

}