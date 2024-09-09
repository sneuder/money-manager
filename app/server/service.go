package server

import (
	"money-manager/core/account"
	"money-manager/core/location"
	"money-manager/internal/schema"

	"gorm.io/gorm"
)

type Services struct {
	Account  account.Service
	Location location.Service
}

func getServices(db *gorm.DB) map[string]schema.Service {
	serviceSetting := schema.ServiceSetting{
		DB: db,
	}

	accountService := account.SetAccountService(serviceSetting)

	serviceCollection := []schema.Service{}

	serviceCollection = append(serviceCollection, accountService.Services...)

	services := make(map[string]schema.Service)

	for _, service := range serviceCollection {
		services[service.Name] = service
	}

	return services
}